document.getElementById("logout-anchor").addEventListener("click", logout);

function logout()
{
    localStorage.removeItem("current-user");
    window.Location.href = "../FRONTEND/login.html"; 
}

document.getElementById("submit-button").addEventListener("submit", attemptSubmit);

function attemptSubmit(event)
{
    event.preventDefault();

    const type = document.getElementById("typeInput").value;
    const description = document.getElementById("description").value;
    const amount = document.getElementById("amount").value;

    const userId = localStorage.getItem("current-user");

    if(!userId)
    {
        window.Location.href = "../FrontEnd/login.html";
    }
    else if(description == "")
    {
        const messageDiv = document.getElementById("message");

        messageDiv.hidden = false;

        messageDiv.innerText = "Cannot submit a request without a description, please specify your reason";
    }
    else if(amount == "")
    {
        const messageDiv = document.getElementById("message");

        messageDiv.hidden = false;

        messageDiv.innerText = "Please make sure you specify the amount you need reimbursed.";
    }
    else
    {
        const reimbursement = {id:0, author:userId, description:description, type:type, amount:amount};

        const payLoad = JSON.stringify(reimbursement);

        sendAjaxRequest("POST", "",paylod,submitSuccessful,submitFailed,userId);
    }
}

function submitFailed()
{
    const messageDiv = document.getElementById("message");
    messageDiv.hidden = false;
    messageDiv.inenerText = "Sorry, Reimbursement Submission has failed.";
}