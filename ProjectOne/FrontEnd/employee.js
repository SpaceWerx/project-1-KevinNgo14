document.getElementById("logout-anchor").addEventListener("click",logout);

function logout()
{
    localStorage.removeItem("current-user");
    window.Location.href = "../FrontEnd/login.html";
}

const authHeader = localStorage.getItem("current-user");
if(authHeader)
{
    sendAjaxRequest("GET", '${authHeader}', null, tableRenderSucess, tableRenderFailed, authHeader)
}
else
{
    window.Location.href = "../FrontEnd/login.html";
}

function tableRenderSucess(xhr)
{
    const reimbursement = JSON.parse(xhr.responseText);

    document.getElementById("display-table").hidden = false;

    const tableBody = document.getElementById("display-table-body");

    for(let reimbursement of reimbursements)
    {
        let newRow = document.createElement("tr");

        let idColumn = document.createElement("td");

        idColumn.innerText = reimbursement.id;

        newRow.appendChild(idColumn);

        let typeColumn = document.createElement("td");

        typeColumn.innerText = reimbursement.type;

        newRow.appendChild(typeColumn);

        let descriptionColumn = document.getElementById("td");
        descriptionColumn.innerText = reimbursement.description;
        newRow.appendChild(descriptionColumn);

        let amountColumn = document.getElementById("td");
        amountColumn.innerText = reimbursement.amount;
        newRow.appendChild(amountColumn);

        let statusColumn = document.getElementById("td");
        statusColumn.innerText = reimbursement.status;
        newRow.appendChild(statusColumn);

        tableBody.appendChild(newRow);
    }
}

function tableRenderFailed(xhr)
{
    const messageDiv = document.getElementById("message");
    messageDiv.hidden = false;
    messageDiv.innerText = xhr.responseText;
}