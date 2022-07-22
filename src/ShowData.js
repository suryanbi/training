import React from 'react'

export const ShowData = (props) => {
  return (
    <div>
        <table className='table table-stripped'>
            <thead>
                <tr>
                    <th>Driver Id</th>
                    <th>Driver Name</th>
                    <th>Mobile Number</th>
                    <th>Location</th>
                    <th>Date Of Birth</th>
                    <th>Rating</th>

                </tr>
            </thead>
            <tbody>
            {
                props.data.map( (element,idx) => {
                    return <tr key ={idx}>
                    <td>{element.driverId}</td>
                    <td>{element.driverName}</td>
                    <td>{element.mobileNumber}</td>
                    <td>{element.location}</td>
                    <td>{element.dateOfBirth}</td>
                    <td>{element.rating}</td>

                    
                    
                    </tr>
                })
            }
            </tbody>
        </table>
    </div>
  )
}