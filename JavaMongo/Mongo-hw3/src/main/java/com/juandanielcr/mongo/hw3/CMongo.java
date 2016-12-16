/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juandanielcr.mongo.hw3;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Juan Daniel CR
 */
public class CMongo {
    
    
    public static void main(String[] args) {
        MongoClient cliente= new MongoClient("localhost");
        MongoDatabase db= cliente.getDatabase("user");
        MongoCollection coll= db.getCollection("grades");
        
        int student_id=0;
        double score=0;
        int flag=0;
        int borrado=0;
        
        Document filter=new Document("type","homework");
        Document projection= new Document("score",1).append("student_id",1);
        Document sort= new Document("student_id",1).append("score",-1);
        MongoCursor cursor= coll.find().filter(filter).projection(projection).sort(sort).iterator();
        try{
            System.out.println("hola");
            while(cursor.hasNext()){                
                    Document doc=(Document) cursor.next();
                    student_id=doc.getInteger("student_id");
                    score=doc.getDouble("score");
                    flag++;
                    if(flag%2==0){
                        Document borra=new Document("student_id",student_id).append("score",score);
                        coll.deleteOne(borra);
                        borrado++;
                    }
                   
            }
            System.out.println(String.valueOf(borrado));
        }finally{
            cursor.close();
        }
    }
}
