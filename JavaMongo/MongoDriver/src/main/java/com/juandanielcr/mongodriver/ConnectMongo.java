/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juandanielcr.mongodriver;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;
/**
 *
 * @author Juan Daniel CR
 */
public class ConnectMongo {
    public static void main(String[] args) {
        MongoClient client= new MongoClient("localhost");
        MongoDatabase db_test= client.getDatabase("test");
        MongoCollection coll_test=db_test.getCollection("test");
        
        Document documentojava= new Document();
        documentojava.append("String", "Text value valid for Java");
        documentojava.append("int", 1);
        documentojava.append("float", 1.2);
        documentojava.append("double", 2.2222);
        documentojava.append("boolean", true);
        documentojava.append("Object_Id", new ObjectId());
        
        String str=documentojava.getString("String");
        System.out.println("String: "+str);
        System.out.println("Tamaño: "+documentojava.size());
      
    }
}
