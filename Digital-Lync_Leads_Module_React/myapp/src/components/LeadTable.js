import React, { useState, useEffect } from 'react';
import './LeadTable.css';

function LeadTable() {
    const [leads, setLeads] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/api/getAllLeads')
            .then(response => {
                if (!response.ok) {
                    throw new Error(`HTTP error! status: ${response.status}`);
                }
                return response.json();
            })
            .then(data => {
                console.log('Data received:', data);
                setLeads(data);
            })
            .catch(error => console.error('Error:', error));
    }, []);

    return (
        <div>
            <a href="http://localhost:3000/create-lead" className="create-lead-link">Create Lead</a>
            <table className="lead-table">
                <thead>
                    <tr>
                        <th></th>
                        <th>Name</th>
                        {/* <th>CC</th> */}
                        <th>Contact No</th>
                        {/* <th>Email</th> */}
                        {/* <th>Fee Coated</th> */}
                        {/* <th>Lead Status</th> */}
                        {/* <th>Lead Source</th> */}
                        <th>Tech Stack</th>
                        {/* <th>Courses</th> */}
                        <th>Class Mode</th>
                        {/* <th>Batch Timing</th> */}
                        {/* <th>Description</th> */}
                        {/* <th>Next Follow Up</th> */}
                        <th>Created On</th>
                    </tr>
                </thead>
                <tbody>
                    {Array.isArray(leads) ? leads.map((lead, index) => (
                        <tr key={index}>
                            <td><input type="checkbox" /></td>
                            <td>{lead.name}</td>
                            {/* <td>{lead.cc}</td> */}
                            <td>{lead.contactNo}</td>
                            {/* <td>{lead.email}</td> */}
                            {/* <td>{lead.feeCoated}</td> */}
                            {/* <td>{lead.leadStatus}</td> */}
                            {/* <td>{lead.leadSource}</td> */}
                            <td>{lead.techStack}</td>
                            {/* <td>{lead.courses}</td> */}
                            <td>{lead.classMode}</td>
                            {/* <td>{lead.batchTiming}</td> */}
                            {/* <td>{lead.description}</td> */}
                            <td>{lead.formattedNextFollowUp}</td>
                        </tr>
                    )) : <tr><td colSpan="13">No leads found</td></tr>}
                </tbody>
            </table>
        </div>
    );
}

export default LeadTable;