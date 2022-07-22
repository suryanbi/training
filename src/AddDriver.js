import axios from 'axios'
import React,{useState,useEffect} from 'react'




   

export const AddDriver = () => {

   
    const [driver,setDriver] = useState({})

    const handleSubmit=(event) => {
        event.preventDefault();
        axios.post("http://localhost:4044/api/v1/drivers",driver)
        .then( response=> console.log(response.status))        
    
    }
    const handleChange=(event)=>{
        let name=event.target.name;
        let value=event.target.value;
    setDriver(obj =>({...obj,[name]:value}))
    } 

  return (
    <div>
        <form onSubmit={handleSubmit}>

                <div className='form-group'>
                    <label htmlFor="">Driver Id</label>
                    <input type="text" name="driverId" onChange={handleChange} className='form-control'/>
                </div>

                <div className='form-group'>
                    <label htmlFor="">Driver Name</label>
                    <input type="text" name="driverName" onChange={handleChange} className='form-control'/>
                </div>

                <div className='form-group'>
                    <label htmlFor="">Mobile Number</label>
                    <input type="text" name="mobileNumber" onChange={handleChange} className='form-control'/>
                </div>

                <div className='form-group'>
                    <label htmlFor="">Location</label>
                    <input type="text" name="location" onChange={handleChange} className='form-control'/>
                </div>

                <div className='form-group'>
                    <label htmlFor="">Date Of Birth</label>
                    <input type="Date" name="dateOfBirth" onChange={handleChange} className='form-control' />
                </div>

                <div className='form-group'>
                    <label htmlFor="">Rating</label>
                    <input type="text" name="rating" onChange={handleChange} className='form-control'/>
                </div>

         

            <input type='submit' value="Add" className='btn-btn-infor'></input>

        </form>
    </div>
  )
}
