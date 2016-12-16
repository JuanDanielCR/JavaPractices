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
import com.mongodb.client.model.Projections;
import java.math.MathContext;
import org.bson.BSON;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Mario Osorio
 */
public class FindFilterMongo {
    public static void main(String[] args) {
        MongoClient cliente=new MongoClient("localhost");
        MongoDatabase db=cliente.getDatabase("test");
        MongoCollection collection=db.getCollection("FindFilter");
        
        collection.drop();
        
        for(int i=0; i<100;i++){
            int x=(int) (Math.random() * 20);
            int y=(int) (Math.random() * 100);
            collection.insertOne(new Document()
                                .append("x",x)
                                .append("y",y)
                                .append("i",i));
        }
        
        
        Document filter=new Document().append("x",0).append("y",new Document("$lt",50));
        Bson projection=(Bson) Projections.include("x","i");
        //Document projection=(new Document().append("x":1);  1-include, 0- exclude
        
        
        MongoCursor<Document> result= collection.find(filter)
                                                .projection(projection)
                                                .limit(5)
                                                .iterator();
        try{
        if(result.hasNext()){
            while(result.hasNext()){
                Document ind=(Document) result.next();
                System.out.println(ind.toString());
            }
            long count=collection.count(filter);
            System.out.println(String.valueOf(count));
        }
        }finally{
            result.close();
        }
        
    }
}
