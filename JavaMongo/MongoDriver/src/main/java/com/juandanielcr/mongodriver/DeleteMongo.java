/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juandanielcr.mongodriver;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Mario Osorio
 */
public class DeleteMongo {
    public static void main(String[] args) {
        MongoClient client= new MongoClient("localhost");
        MongoDatabase db_test= client.getDatabase("test");
        MongoCollection coll_test=db_test.getCollection("DeleteTest");
        
        coll_test.drop();
        
        for(int i=0;i<10;i++){
            coll_test.insertOne(new Document("x",i));
        }    
        
        //coll_test.deleteOne(new Document("x",5));
        coll_test.deleteMany(new Document("x",new Document("$gt",5)));
        
        MongoCursor<Document> cursor= coll_test.find().iterator();
            try{
                while(cursor.hasNext()){
                    Document individual=cursor.next();
                    individual.toString();
                    System.out.println(individual);
                }
            }finally{
                cursor.close();
            }
    }
}
