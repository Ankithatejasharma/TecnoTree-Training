// const MongoClient = require('mongodb').MongoClient;
// const url = 'mongodb://localhost:27017/mydatabase';
// MongoClient.connect(url, function(err, client) {

//     if (err) throw err;
    
//     console.log("Connected successfully to MongoDB");
    
//     // Perform database operations here
    
//     client.close();
    
//     });
//     const db = client.db();

//     const collection = db.collection('mycollection');

//     collection.insertOne({ name: 'John Doe', age: 30 }, function(err, result) {

//     if (err) throw err;

//        console.log("Document inserted successfully");

// });



// const express=require("express");
// const mongoose=require("mongoose");
// const app=express();

// mongoose.connect("mongodb://localhost:27017/Ecommerce",{
//     useNewUrlParser:true,useUnifiedTopology:true
// },(err)=>{
//     if(err){
//         console.log(err)
//     }
//     else{
//         console.log("Successfully Connected!!")
//     }
// })
// app.listen(3000,()=>{
//     console.log("On port 3000")
// })


const express = require("express");
const mongoose = require("mongoose");
const app = express();
mongoose.connect("mongodb://localhost:27017/Ecommerce", { useNewUrlParser: true,
useUnifiedTopology: true,
}).then(() => {
 console.log("Successfully connected to database!");
}).catch((error) => {
 console.log("Failed to connect to database!", error);
});
app.listen(3000, () => { console.log("Server is running on port 3000.");
});