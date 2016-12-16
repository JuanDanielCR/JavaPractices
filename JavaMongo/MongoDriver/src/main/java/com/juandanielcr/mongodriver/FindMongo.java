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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Mario Osorio
 */
public class FindMongo {
    public static void main(String[] args) {
        MongoClient client= new MongoClient("localhost");
        MongoDatabase db_test= client.getDatabase("test");
        MongoCollection coll_test=db_test.getCollection("FindTest");
        
        coll_test.drop();
        
        for(int i=0;i<10;i++){
            coll_test.insertOne(new Document("x",i));
        }      
        System.out.println("Obteniendo un valor:");
           Document primero= (Document) coll_test.find().first();
           System.out.println(primero.toString());
        System.out.println("Obteniendo Todo y Guardando en ArrayList:");
            List<Document> compras= (List<Document>) coll_test.find().into(new ArrayList<Document>());
            for(Document compra:compras){
                compra.toString();
                System.out.println(compra);
            }
        System.out.println("Obteniendo los valores en un Cursor:");
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
        System.out.println("Obteniendo un valor:");
            long count=coll_test.count();
            System.out.println(String.valueOf(count));
    }
}
