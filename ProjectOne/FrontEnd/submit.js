document.getElementById("logout-anchor").addEventListener("click", logout);
document.getElementById("submit-button").addEventListener("click", attemptSubmit);

async function logout()
{
    localStorage.removeItem("current-user");
    window.Location.href = "../FRONTEND/login.html"; 
}
async function attemptSubmit()
{

    const types = document.getElementById("typeInput").value;
    const desc = document.getElementById("description").value;
    const amounts = document.getElementById("amount").value;
    let string, testStatus  = "PENDING";

    console.log(desc);
    console.log(types);
    console.log(amounts);

    let reim = 
    {
        "id" : 0,
        "author": 1,
        "resolver": 1,
        "description": desc,
        "type" : types,
        "status" : testStatus,
        "amount": amounts

    }
    console.log(reim);

    let response = await fetch("http://localhost:5000/submit",{
        method: "POST",
        body: JSON.stringify(reim), //This will turn our user object into JSON we can send
        credentials: "include"
    });

    console.log(response.status);


}

//  async function attemptSubmit(event)
// {
//     event.preventDefault();

//     const type = document.getElementById("typeInput").value;
//     const description = document.getElementById("description").value;
//     const amount = document.getElementById("amount").value;

//     const userId = localStorage.getItem("current-user");

//     if(!userId)
//     {
//         window.Location.href = "../FrontEnd/login.html";
//     }
//     else if(description == "")
//     {
//         const messageDiv = document.getElementById("message");

//         messageDiv.hidden = false;

//         messageDiv.innerText = "Cannot submit a request without a description, please specify your reason";
//     }
//     else if(amount == "")
//     {
//         const messageDiv = document.getElementById("message");

//         messageDiv.hidden = false;

//         messageDiv.innerText = "Please make sure you specify the amount you need reimbursed.";
//     }
//     else
//     {
//         const reimbursement = {id:0, author:userId, description:description, type:type, amount:amount};

//         const payLoad = JSON.stringify(reimbursement);

//         sendAjaxRequest("POST", "",paylod,submitSuccessful,submitFailed,userId);
//     }
// }

// function submitFailed()
// {
//     const messageDiv = document.getElementById("message");
//     messageDiv.hidden = false;
//     messageDiv.inenerText = "Sorry, Reimbursement Submission has failed.";
// }