import axios from "axios";
import React, { useEffect, useState } from "react";
import bootstrap from "bootstrap"

function ShowData(props){

  

    // useEffect(()=>{
    //     const mydata = axios.get(`http://localhost:3000/contact/${filter ? filter : ""}`).then((response)=>{
    //         console.log(response.data)
    //         setMyContact(response.data);
    //     });

    //     console.log(myContact);
    // },[])

    const showMyData = (
        <table className="table">
                <thead className="thead-dark">
                    <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Phone Number</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        props.myContact.map((data)=>{
                            return(
                               
                                    <tr key={data.userID}>
                                    <th scope="row">{data.userID}</th>
                                    <td>{data.name}</td>
                                    <td>{data.emailID}</td>
                                    <td>{data.phone}</td>
                                    </tr> 
                                       
                            )
                        })
                    }

                </tbody>
            </table>
    )


    const showMySingleData = (
        <table className="table">
                <thead className="thead-dark">
                    <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Phone Number</th>
                    </tr>
                </thead>
                <tbody>
                    {
                       
                               
                                    <tr key={props.myContact.userID}>
                                    <th scope="row">{props.myContact.userID}</th>
                                    <td>{props.myContact.name}</td>
                                    <td>{props.myContact.emailID}</td>
                                    <td>{props.myContact.phone}</td>
                                    </tr> 
                                       
                            
                        
                    }

                </tbody>
            </table>
    )

    const errormsg = (
        <div className="container">
            <div className="alert alert-success" role="alert">
                <h4 className="alert-heading">oops !!</h4>
                <p>The data you are trying to find is not available</p>
                <hr/>
                <p className="mb-0">Thank You</p>
            </div>
        </div>
    )

    const searchmsg = (
        <div className="container">
            <div className="alert alert-success" role="alert">
                <h4 className="alert-heading">Please press search button to get data</h4>
                <hr/>
                <p className="mb-0">Thank You</p>
            </div>
        </div>
    )
    
    

    

    return(
        <div>
            <h3>My Data</h3>
            {console.log("my error in show data : ", props.noerror)}
            {console.log("in show data" , props.myContact)}
            <div>
               {/* {props.myContact.length > 0 && showMyData} */}
               {props.myContact.length === 0 && searchmsg}
               {props.noerror===true && props.myContact.length >= 1 && showMyData}
               {/* {props.noerror===true && props.myContact.length === 1 && showMySingleData} */}
               {props.noerror==false && errormsg}
            
            </div>
            
            
        </div>
    )
}

export default ShowData;