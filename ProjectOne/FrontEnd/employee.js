document.getElementById("logout-anchor").addEventListener("click",logout);
document.getElementById("view-anchor").addEventListener("click",viewData);

function logout()
{
    localStorage.removeItem("current-user");
    window.Location.href = "../FrontEnd/login.html";
}

async function viewData()
{
    // let user =
    // {

    // }
    // console.log(user);

    let response = await fetch("http://localhost:5000/reimbursement",{
        method: "GET",
        // body: JSON.stringify(user), 
        credentials: "include"
    });

    console.log(response);

    if(response.status === 200){
        let data = await response.json();
        console.log(data);
        
        for(let reimbursement of data)
        {
            let row = document.createElement("tr");
            let cell = document.createElement("td");

            cell.innerHTML = reimbursement.id;
            row.appendChild(cell);

            let cell2 = document.createElement("td");
            cell2.innerHTML = reimbursement.author;
            row.appendChild(cell2)

            let cell3 = document.createElement("td");
            cell3.innerHTML = reimbursement.resolver;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = reimbursement.description;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = reimbursement.type;
            row.appendChild(cell5);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.status;
            row.appendChild(cell6);

            let cell7 = document.createElement("td");
            cell7.innerHTML = reimbursement.amount;
            row.appendChild(cell7);

            document.getElementById("data_table").appendChild(row);
        }
    }
}
// const authHeader = localStorage.getItem("current-user");
// if(authHeader)
// {
//     sendAjaxRequest("GET", '${authHeader}', null, tableRenderSucess, tableRenderFailed, authHeader)
// }
// else
// {
//     window.Location.href = "../FrontEnd/login.html";
// }

// function tableRenderSucess(xhr)
// {
//     const reimbursement = JSON.parse(xhr.responseText);

//     document.getElementById("display-table").hidden = false;

//     const tableBody = document.getElementById("display-table-body");

//     for(let reimbursement of reimbursements)
//     {
//         let newRow = document.createElement("tr");

//         let idColumn = document.createElement("td");

//         idColumn.innerText = reimbursement.id;

//         newRow.appendChild(idColumn);

//         let typeColumn = document.createElement("td");

//         typeColumn.innerText = reimbursement.type;

//         newRow.appendChild(typeColumn);

//         let descriptionColumn = document.getElementById("td");
//         descriptionColumn.innerText = reimbursement.description;
//         newRow.appendChild(descriptionColumn);

//         let amountColumn = document.getElementById("td");
//         amountColumn.innerText = reimbursement.amount;
//         newRow.appendChild(amountColumn);

//         let statusColumn = document.getElementById("td");
//         statusColumn.innerText = reimbursement.status;
//         newRow.appendChild(statusColumn);

//         tableBody.appendChild(newRow);
//     }
// }

// function tableRenderFailed(xhr)
// {
//     const messageDiv = document.getElementById("message");
//     messageDiv.hidden = false;
//     messageDiv.innerText = xhr.responseText;
// }
