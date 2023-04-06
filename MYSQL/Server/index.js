const express=require("express");
const app=express();
const bodyParser=require("body-parser");
const mysql=require("mysql2");
const cors=require("cors");

const db=mysql.createPool({
    host:"localhost",
    user:"root",
    password:"Ankitha#19",
    database:"library"
})

app.use(cors());
app.use(express.json());
app.use(bodyParser.urlencoded({extended:true}));

app.get("/api/get",(req,res)=>{
    const sqlGet="SELECT * FROM authors";
    db.query(sqlGet,(error,result)=>{
        res.send(result);
    });
});

app.post("/api/post",(req,res)=>{
    const{authid,firstname,lastname,email}=req.body;
    const sqlInsert="INSERT INTO authors(authid,firstname,lastname,email) VALUES (?,?,?,?)";
    db.query(sqlInsert,[authid,firstname,lastname,email],(error,result)=>{
        if(error){
            console.log(error);
        }
    });
});


app.delete("/api/remove/:authid",(req,res)=>{
    const{authid}=req.params;
    const sqlRemove="DELETE FROM authors WHERE authid=?";
    db.query(sqlRemove,authid,(error,result)=>{
        if(error){
            console.log(error);
        }
    });
});

app.get("/api/get/:authid",(req,res)=>{
    const{authid}=req.params;
    const sqlGet="SELECT * FROM authors WHERE authid=?";
    db.query(sqlGet,authid,(error,result)=>{
       if(error){
        console.log(error);
       }

        res.send(result);
    });
});

app.put("/api/update/:authid",(req,res)=>{
    const{authid}=req.params;
    const{firstname,lastname,email}=req.body;
    const sqlUpdate="UPDATE authors SET firstname=?,lastname=?,email=? WHERE authid=?";
    db.query(sqlUpdate,[firstname,lastname,email,authid],(error,result)=>{
       if(error){
        console.log(error);
       }

        res.send(result);
    });
});

app.get("/",(req,res)=>{
//     const sqlInsert="INSERT INTO authors(authid,firstname,lastname,email) VALUES (5,'RD','Sharma','rdsharma@gmail.com')"
//     db.query(sqlInsert,(error,result)=>{
//         console.log("error",error);
//         console.log("result",result);
//         res.send("Hello Express!")
// });
    
});

app.listen(5000,()=>{
    console.log("Server Running on Port 5000");
})