import React,{useState,useEffect} from "react";
import {useNavigate,useParams,Link} from "react-router-dom";
import "./AddEdit.css";
import axios from "axios";
import{toast} from "react-toastify";

const initialState={
    authid:"",
    firstname:"",
    lastname:"",
    email:"",
};

const AddEdit=()=>{
    const[state,setState]=useState(initialState);

    const{authid,firstname,lastname,email}=state;

    const navigate=useNavigate();

    const {authid:authid1}=useParams();

    useEffect(()=>{
        axios.get(`http://localhost:5000/api/get/${authid1}`).then((resp)=>setState({...resp.data[0]}))
    },[authid1]);

    const handleSubmit=(e)=>{
        e.preventDefault();
        if(!authid ||!firstname || !lastname ||!email){
            toast.error("Please Provide value into Each Input Field");
        }
        else{
            if(!authid1){
                axios.post("http://localhost:5000/api/post",{
                    authid,
                    firstname,
                    lastname,
                    email
                }).then(()=>{
                    setState({authid:"",firstname:"",lastname:"",email:""})
                }).catch((err)=>toast.error(err.response.data));
                toast.success("Author Added Successfully!!")
            }else{

                axios.put(`http://localhost:5000/api/update/${authid}`,{
                    authid,
                    firstname,
                    lastname,
                    email
                }).then(()=>{
                    setState({firstname:"",lastname:"",email:""})
                }).catch((err)=>toast.error(err.response.data));
                toast.success("Author Updated Successfully!!")

            }
            
            setTimeout(()=>
               navigate("/"),500);
        }
    };

    const handleInputChange=(e)=>{
        const{name,value}=e.target;
        setState({...state,[name]:value});
    };
    return(
        <div style={{marginTop:"100px"}}>
           <form style={{
               margin:"auto",
               padding:"15px",
               maxWidth:"400px",
               alignContent:"center"
           }}
           onSubmit={handleSubmit}
           >
             <label htmlFor="authid">Author ID</label>
             <input
              type="number"
              id="authid"
              name="authid"
              placeholder="Author ID..."
              value={authid}
              onChange={handleInputChange}
             />
             <label htmlFor="firstname">First Name</label>
             <input
              type="text"
              id="firstname"
              name="firstname"
              placeholder="Author's First Name..."
              value={firstname || ""}
              onChange={handleInputChange}
             />
             <label htmlFor="lastname">Last Name</label>
             <input
              type="text"
              id="lastname"
              name="lastname"
              placeholder="Author's Last Name..."
              value={lastname || ""}
              onChange={handleInputChange}
             />
             <label htmlFor="email">Email ID</label>
             <input
              type="email"
              id="email"
              name="email"
              placeholder="Author's Mail ID..."
              value={email || ""}
              onChange={handleInputChange}
             />
             <input type="submit" value={authid1 ? "Update":"Save"}/>
             <Link to="/">
                 <input type="button" value="Go Back"/>
             </Link>
           </form>
        </div>
    )
}
export default AddEdit; 