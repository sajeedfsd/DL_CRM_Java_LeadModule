import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import CreateLeadForm from './components/CreateLeadForm';
import LeadTable from './components/LeadTable';

function App() {
    return (
        <Router>
            <Routes>
                <Route path="/create-lead" element={<CreateLeadForm />} />
                {/* Add more routes as needed */}
                <Route path="/lead-management" element={<LeadTable />} />
            </Routes>
        </Router>
    );
}

export default App;