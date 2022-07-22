import React from 'react'
import  PropTypes from 'prop-types';

export const Image = ({imgRef,altText}) => {
  return (
    <img src={imgRef} alt={altText} className="logo img-thumbnail"></img>
  )
}

Image.propTypes={
    imgRef:PropTypes.string.isRequired,
    altText:PropTypes.string.isRequired
}