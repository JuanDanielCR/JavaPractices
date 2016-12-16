/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juandanielcr.mongoarrays;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author JuanDanielCR
 */
public class MongoArrays {
    public static void main(String args[]){
        MongoClient cliente= new MongoClient("localhost");
        MongoDatabase db= cliente.getDatabase("test");
        
        /*
          Ejemplo para manejo de arreglos
        {
          ServidorMongo: localhost
          Base de datos: test
          Collection: students
        }
        */
        int co=0;
        double sc=0;
        MongoCollection estudiantes=db.getCollection("students");
       DBCursor cursor= 
                (DBCursor) estudiantes
                .find()
                .projection(new Document("scores",new Document("$elemMatch",new Document("type","homework"))).append("scores.type",0).append("name",0)).iterator();
            try{
                while(cursor.hasNext()){
                    Document score=(Document)cursor.next();
                    System.out.println(score.toString());
                    
                    DBObject o = (DBObject) cursor.next();
                    BasicDBList lights = (BasicDBList) o.get("scores");

                        // shows the lights array -- this is actually a collection of DBObjects
                        System.out.println(lights.toString());

                        // optional: break it into a native java array
                        BasicDBObject[] lightArr = lights.toArray(new BasicDBObject[0]);
                        for(BasicDBObject dbObj : lightArr) {
                          // shows each item from the lights array
                          System.out.println(dbObj);
                        }
                    /*MongoCursor<Document> cursor2= 
                    estudiantes
                    .find()
                    .projection(new Document("scores",new Document("$elemMatch",new Document("score",new Document("$gt",sc)))))
                    .iterator();
                    if(cursor.hasNext()){
                     co++;
                    }*/
                }
            }finally{
                cursor.close();
                System.out.println(String.valueOf(co));
            }
       
    }
}
