import React,{useState,useEffect,} from "react";
import { useParams,Link } from "react-router-dom";
import axios from "axios";
import "./View.css";

const View=()=>{
    const [user,setUser]=useState({});

    const{authid}=useParams();
    
    useEffect(()=>{
        axios.get(`http://localhost:5000/api/get/${authid}`).then((resp)=>setUser({...resp.data[0]}))
    },[authid]);
    return(
        <div style={{marginTop:"150px"}}>
            <div className="card">
                <div className="card-header">
                    <p>Author Details :</p>
                </div>
                <div className="container">
                    <strong>Author ID: </strong>
                    <span>{authid}</span><br/><br/>
                    <strong>First name: </strong>
                    <span>{user.firstname}</span><br/><br/>
                    <strong>Last Name: </strong>
                    <span>{user.lastname}</span><br/><br/>
                    <strong>Email: </strong>
                    <span>{user.email}</span><br/><br/>

                    <Link to="/">
                    <div className="btn btn-edit">Go Back</div>
                    </Link>

                </div>
            </div>
        </div>
    );
};
export default View;