import React from 'react'
import { NavBar } from './NavBar'
import { Image } from './Image'
import logo from './images/taxi_image.jpg';

const links = [
  {"link":'/home','text':'Home Tour'},
  {"link":'/about','text':'About Us'},
  {"link":'/client','text':'Client'}
]

export const Header = ({heading}) => {
  
  return (
    <div className='col-md-6'>
        <h1 style={{display:'inline'}}>{heading}</h1>
        <Image imgRef={logo} altText={'company logo'} ></Image>
        <div className='col-md-6'>
        <NavBar data={links}></NavBar>
        </div>
    </div>
  )
}
