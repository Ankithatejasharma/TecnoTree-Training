import React,{useState,useEffect} from "react";
import {Link} from "react-router-dom";
import"./Home.css" ;
import {toast} from "react-toastify";
import axios from "axios";

const Home=()=>{
    const [data,setData]=useState([]);

    const loadData=async()=>{
        const response=await axios.get("http://localhost:5000/api/get");
        setData(response.data);
    };

    useEffect(()=>{
        loadData();

    },[]);

    const deleteContact=(authid)=>{
        if(window.confirm("Are You Sure To Delete The Record!?")){
            axios.delete(`http://localhost:5000/api/remove/${authid}`);
            toast.success("Record Deleted Successfully!!");
            setTimeout(()=>loadData(),500);
        }
    };
    return(
        <div style={{marginTop:"150px"}}>
            <Link to="/addAuthor">
            <button className="btn btn-author">Add Author</button>
            </Link>
        <table className="styled-table">
            <thead>
                <tr>
                    <th style={{textAlign:"center"}}>Author ID</th>
                    <th style={{textAlign:"center"}}>First Name</th>
                    <th style={{textAlign:"center"}}>Last Name</th>
                    <th style={{textAlign:"center"}}>Email</th>
                    <th style={{textAlign:"center"}}>Action</th>
                </tr>
            </thead>
            <tbody>
                {data.map((item,index)=>{
                    return(
                        <tr key={item.authid}>
                            <th scope="row">{index+1}</th>
                            <td>{item.firstname}</td>
                            <td>{item.lastname}</td>
                            <td>{item.email}</td>
                            <td>
                                <Link to={`/update/${item.authid}`}>
                                <button className="btn btn-edit">Edit</button>
                                </Link>
                                <button className="btn btn-delete" onClick={()=>deleteContact(item.authid)}>Delete</button>
                                <Link to={`/view/${item.authid}`}>
                                <button className="btn btn-view">View</button>
                                </Link>
                            </td>
                        </tr>
                    )
                })}
            </tbody>
        </table>
        </div>
    )
}

export default Home;