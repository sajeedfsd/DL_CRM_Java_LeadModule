import React, { useState } from 'react';
import axios from 'axios';
import './CreateLeadForm.css'; // Import the CSS file
import 'bootstrap/dist/css/bootstrap.min.css'; // Import Bootstrap CSS

function CreateLeadForm() {
    const [lead, setLead] = useState({
        name: '',
        cc: '',
        contactNo: '',
        email: '',
        feeCoated: '',
        leadStatus: '',
        description: '',
        nextFollowUp: ''
    });

    const [formSubmitted, setFormSubmitted] = useState(false);

    const handleChange = (e) => {
        setLead({
            ...lead,
            [e.target.name]: e.target.value
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        axios.post('http://localhost:8080/api/createLead', lead)
            .then(response => {
                setFormSubmitted(true);
                console.log(response);
            })
            .catch(error => {
                console.error(error);
            });
    };

    return (
        <div className="container">
            <h1>Create Lead Form</h1>
            <form onSubmit={handleSubmit}>
                <div className="row">
                    <div className="col-md-6">
                        <label>
                            Name:
                            <input type="text" name="name" onChange={handleChange} />
                        </label>
                        <label>
                            Country Code:
                            <input type="text" name="cc" onChange={handleChange} />
                        </label>
                        <label>
                            Contact Number:
                            <input type="text" name="contactNo" onChange={handleChange} />
                        </label>
                        <label>
                            Email:
                            <input type="text" name="email" onChange={handleChange} />
                        </label>
                        <label>
                            Fee Coated:
                            <input type="text" name="feeCoated" onChange={handleChange} />
                        </label>
                        <label>
                            Description:
                            <input type="text" name="description" onChange={handleChange} />
                        </label>
                        <label>
                            Next Follow Up:
                            <input type="date" name="nextFollowUp" onChange={handleChange} />
                        </label>
                        <label>
                            Lead Status:
                            <select name="leadStatus" onChange={handleChange}>
                                <option value="">Select</option>
                                <option value="None">None</option>
                                <option value="NotContacted">Not Contacted</option>
                                <option value="Attempted">Attempted</option>
                                <option value="WarmLead">Warm Lead</option>
                                <option value="Opportunity">Opportunity</option>
                                <option value="AttendedDemo">Attended Demo</option>
                                <option value="Visited">Visited</option>
                                <option value="Registered">Registered</option>
                                <option value="ColdLead">Cold Lead</option>
                            </select>
                        </label>
                    </div>
                    <div className="col-md-6">
                        <label>
                            Batch Timing:
                            <select name="batchTiming" onChange={handleChange}>
                                <option value="">Select</option>
                                <option value="_7AM_8AM">7AM - 8AM</option>
                                <option value="_8AM_9AM">8AM - 9AM</option>
                                <option value="_9AM_10AM">9AM - 10AM</option>
                                <option value="_10AM_11AM">10AM - 11AM</option>
                                <option value="_11AM_12P">11AM - 12PM</option>
                                <option value="_12PM_1PM">12PM - 1PM</option>
                                <option value="_1PM_2PM">1PM - 2PM</option>
                                <option value="_2PM_3PM">2PM - 3PM</option>
                                <option value="_3PM_4PM">3PM - 4PM</option>
                                <option value="_4PM_5PM">4PM - 5PM</option>
                                <option value="_5PM_6PM">5PM - 6PM</option>
                                <option value="_6PM_7PM">6PM - 7PM</option>
                                <option value="_7PM_8PM">7PM - 8PM</option>
                                <option value="_8PM_9PM">8PM - 9PM</option>
                            </select>
                        </label>
                        <label>
                            Class Mode:
                            <select name="classMode" onChange={handleChange}>
                                <option value="">Select</option>
                                <option value="HYDClassRoom">HYD Classroom</option>
                                <option value="BLRClassRoom">BLR Classroom</option>
                                <option value="IndiaOnline">India Online</option>
                                <option value="InternationalOnline">International Online</option>
                            </select>
                        </label>
                        <label>
                            Course:
                            <select name="course" onChange={handleChange}>
                                <option value="">Select</option>
                                <option value="Angulaar">Angulaar</option>
                                <option value="AWS">AWS</option>
                                <option value="AWSWithDevOps">AWS With DevOps</option>
                                <option value="Azure">Azure</option>
                                <option value="AzureDevOps">Azure DevOps</option>
                                <option value="BusinessAnlayst">Business Analyst</option>
                                <option value="CloudOpsMasters">Cloud Ops Masters</option>
                                <option value="DevOps">DevOps</option>
                                <option value="FrontEndAngular">Front End Angular</option>
                                <option value="FrontEndReact">Front End React</option>
                                <option value="FullStackJAVA">Full Stack JAVA</option>
                                <option value="FullStackMEAN">Full Stack MEAN</option>
                                <option value="FullStackMERN">Full Stack MERN</option>
                                <option value="FullstackPython">Full stack Python</option>
                                <option value="FullStackReactJAVA">Full Stack React JAVA</option>
                                <option value="Java">Java</option>
                                <option value="NeedCounselling">Need Counselling</option>
                                <option value="Others">Others</option>
                                <option value="PowerBI">Power BI</option>
                                <option value="Python">Python</option>
                                <option value="React">React</option>
                                <option value="SalesForceAdmin">SalesForce Admin</option>
                                <option value="SalesforceDeveloper">Salesforce Developer</option>
                                <option value="ServiceNow">ServiceNow</option>
                                <option value="AzureDataEngineer">Azure Data Engineer</option>
                                <option value="Tableau">Tableau</option>
                                <option value="Testing">Testing</option>
                            </select>
                        </label>
                        <label>
                            Lead Source:
                            <select name="leadSource" onChange={handleChange}>
                                <option>Select</option>
                                <option value="None">None</option>
                                <option value="WalkIn">Walk-In</option>
                                <option value="StudentReferral">Student Referral</option>
                                <option value="Demo">Demo</option>
                                <option value="WebSite">Website</option>
                                <option value="WebsiteChat">Website Chat</option>
                                <option value="InboundCall">Inbound Call</option>
                                <option value="GoogleAdWords">Google AdWords</option>
                                <option value="FacebookAds">Facebook Ads</option>
                                <option value="GoogleMyBusiness">Google My Business</option>
                                <option value="WhatsAppDigitalLync">WhatsApp DigitalLync</option>
                            </select>
                        </label>
                        <label>
                            Tech Stack:
                            <select name="techStack" onChange={handleChange}>
                                <option value="">Select</option>
                                <option value="CloudOps">CloudOps</option>
                                <option value="Salesforce">Salesforce</option>
                                <option value="FullStack">FullStack</option>
                                <option value="DataStack">DataStack</option>
                                <option value="ServiceNow">ServiceNow</option>
                                <option value="BusinessStack">BusinessStack</option>
                                <option value="CareerCounselling">Career Counselling</option>
                            </select>
                        </label>
                    </div>
                </div>
                <div className="submit">
                    <button type="submit">Submit</button>
                    {formSubmitted && <p>Form submitted!</p>}
                </div>
            </form>
        </div>
    );
}

export default CreateLeadForm;