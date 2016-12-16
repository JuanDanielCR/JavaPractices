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
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.UpdateOptions;
import org.bson.Document;

/**
 *
 * @author Mario Osorio
 */
public class UpdateMongo {
    public static void main(String[] args) {
        MongoClient cliente=new MongoClient("localhost");
        MongoDatabase db=cliente.getDatabase("test");
        MongoCollection collection=db.getCollection("UpdateTest");
        
        collection.drop();
        
        for(int i=0; i<20;i++){
            int x=(int) (Math.random() * 20);

            collection.insertOne(new Document()
            .append("_id",i)
            .append("i",x));
        }
        
        //REPLACE
        collection.replaceOne(eq("_id",5), new Document("_id",5).append("x",5).append("update","Si"));
        /*                    new Document().append("i",5)*/
        
        //UPDATE
        collection.updateOne(eq("_id",6), new Document("$set",new Document("i",666)));
        
        //UPSERT
        collection.updateOne(eq("_id",6), 
                            new Document("$set",new Document("i",666)), 
                            new UpdateOptions().upsert(true));
        
        MongoCursor<Document> cursor= collection.find().iterator();
        try{
            while(cursor.hasNext()){
                Document element=cursor.next();
                System.out.println(element.toString());
            }
        }finally{
            cursor.close();
        }
    }
}
