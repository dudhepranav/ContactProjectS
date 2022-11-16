// import axios from "axios";
import React, { useState } from "react";
import validator from 'validator'

function Form(props){

    const [currID , setCurrID] = useState("");
     const [emailError, setEmailError] = useState("Invalid email or Phone");

    

    const onSubmitHandler = async(e)=>{
        e.preventDefault();
        const url = `http://localhost:5000/contact/${currID}`
        props.getEmailID(currID)
        console.log(url)
        setEmailError("")
        setCurrID("");
        // if( validator.isEmail(currID) || validator.isMobilePhone(currID)  || currID==""){
        //     const url = `http://localhost:5000/contact/${currID}`
        //     props.getEmailID(currID)
        //     console.log(url)
        //     setEmailError("")
        //     setCurrID("");

        // }
        // else{
        //     setEmailError("Invalid email or Phone")

        // }

        
    }

    return(
        <div>
            {/* <form onSubmit={onSubmitHandler}>
            <div >
                <input type="text" placeholder="Enter email or phone ✍️" onChange={(e)=>{setCurrID(e.target.value)}} value={currID}></input>
                <span style={{
                        fontWeight: 'bold',
                        color: 'red',
                        }}>{emailError}</span>
                
            </div>
            <div>
                <button type="submit" >Search 🔍</button>
            </div>
            </form> */}
            <div>
            <nav className="navbar navbar-light bg-light">
                Find My Data 
                <form className="form-inline" onSubmit={onSubmitHandler}>
                    <div className="d-flex flex-column">
                        <input className="form-control mr-sm-2" type="search" placeholder="Enter email or phone ✍️" aria-label="Search" onChange={(e)=>{setCurrID(e.target.value) }} value={currID} />
                       {console.log("valid or not ",props.invalid)}
                       { props.invalid==true   && <span style={{
                            fontWeight: 'unset',
                            fontSize : 'small',
                            color: 'red',   
                            }}>Invalid email or phone</span> }
                    </div>
                    <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </nav>
            </div>
            <div className="container">
                 <hr className="hr hr-blurry" />
            </div>
            
            
        </div>
    )
}

export default Form;