/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juandanielcr.mongodriver;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Mario Osorio
 */
public class InsertMongo {
    public static void main(String[] args) {
        MongoClient client= new MongoClient("localhost");
        MongoDatabase db_test= client.getDatabase("test");
        MongoCollection coll_test=db_test.getCollection("JavaTest");
       
        coll_test.drop();
        
        Document juan=new Document();
                 juan.append("nombre","Juan Daniel");
                 juan.append("edad",18);
                 juan.append("sexo","Masculino");
                 juan.append("escuela","IPN");
                 
        Document jose=new Document();
                 jose.append("nombre","José de Jesús");
                 jose.append("edad",18);
                 jose.append("sexo","Masculino");
                 jose.append("escuela","IPN");
        
        //coll_test.insertOne(juan);
          coll_test.insertMany(Arrays.asList(juan,jose));
    }
}
