import React from 'react'
import { AddDriver } from './AddDriver'
import { FetchData } from './FetchData'

export const CrudComponent = () => {
  return (
    <div>
        <FetchData></FetchData>
        <AddDriver></AddDriver>
    </div>
  )
}
