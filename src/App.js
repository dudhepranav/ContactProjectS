import logo from './logo.svg';
import './App.css';
import Form from './Component/Form';
import ShowData from './Component/ShowData';
import { useEffect, useState } from 'react';
import axios from 'axios';
function App() {

  const [filter , setFilter] = useState("");
  const [myContact , setMyContact] = useState([])
  const [noerror , setNoerror] = useState()
  const [invalid , setInvalid] = useState();
  

  const getEmailID = (data)=>{
   
    setFilter(data);
    myfn(data);
    
   
  }
  

  // useEffect(()=>{
  //   const setmystate = ()=>{
  //     const mydata = axios.get(`http://localhost:3000/contact/${filter ? filter : ""}`).then((response)=>{
  //       console.log(response.data)
  //       setMyContact(response.data);
  //   });

  //   console.log(myContact)

  //   }
    
  //   setmystate();

   
  // }, [])

  const myfn = (filter)=>{
      if(filter == ""){
        const mydata = axios.get(`http://localhost:5000/contacts/${filter ? filter : ""}`).then((response)=>{
      console.log(" :", response.data)
      setMyContact(response.data)
      console.log("mycontact" , myContact);
      setNoerror(true);
      setInvalid(false);

      }).catch((error)=>{
     console.log("error : "+error)
      setNoerror(false);

        })
      }
      else{
        let myarra = [];
        const mydata = axios.get(`http://localhost:9999/validate/${filter}`).then((response)=>{
          console.log(" :", response)
          myarra.push(response.data);
          setMyContact(myarra);
          
          //setMyContact(response.data)
          console.log("mycontact" , myContact);
          setNoerror(true);
          setInvalid(false);

        }).catch((error)=>{
          console.log("error Invalid userID or phoneNumber: "+error)
          console.log( error.response);
          if(error.response.status == 400){
              setInvalid(true);
          }
          else{
              setInvalid(false)
              setNoerror(false);
          }
          
          
          console.log("is invalid : ", invalid);

        })

      }

  //   const mydata = axios.get(`http://localhost:5000/contacts/${filter ? filter : ""}`).then((response)=>{
  //     console.log(" :", response.data)
  //     setMyContact(response.data)
  //     console.log("mycontact" , myContact);
  //     setNoerror(true);

  // }).catch((error)=>{
  //   console.log("error : "+error)
  //   setNoerror(false);

  // })
}

  

 

  return (
    <div className="App">
        <Form getEmailID= {getEmailID} invalid = {invalid}/>
        <ShowData myContact = {myContact} noerror = {noerror}/>
        
    </div>
  );
}

export default App;
