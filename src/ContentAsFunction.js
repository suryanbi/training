import React,{useState} from 'react'

export const ContentAsFunction = () => {
    const [count,setCount] =useState(1);
    const [message,setMessage] =  useState('');

    const handleClick = () => {
        console.log('handle click called');
        setCount(count => count+1);
    }

    const handleChange = (event) => {
        setMessage(message => [...event.target.value])
        
    }

  return (
    <div>
        <p>Count {count}</p>
        <p><button onClick={handleClick} className='btn-btn-info'>+</button></p>
        <p>
            <input type='text' name='msg' onChange={handleChange}/>
        </p>
        <p>Message:{message}</p>
    </div>
  )
}
