import React from 'react'

export const Review = (props) => {
  return (
    <div>
        <p>Parveen Call Taxi</p>
        <p><button onClick={props.handleClick} className='btn-btn-info'>+</button></p>
        <p>Likes:{props.count}</p>

        <p><button onClick={props.handleClick1} className='btn-btn-info'>-</button></p>
        <p>DisLikes:{props.dislikescount}</p>

        
    </div>
  )
}
