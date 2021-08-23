Feature: How much borrow

Scenario: Calculate the total amount user can borrow and check the functionality of step over icon.
Given Open URL
When After entering all details your_income "80000",your_otherincome "10000",living_expenses "500",other_loan_repayments "100",total_creditcardlimits "10000" and click on How much i could borrow button
Then Total borrow amount should calculate as borrowResultTextAmount "$479000"




Scenario: Calculate the total amount user can borrow when entering only $1 for Living expenses, and leaving all other fields as zero
Given Open URL
When After entering all details your_income "0",your_otherincome "0",living_expenses "1",other_loan_repayments "0",total_creditcardlimits "0" and click on How much i could borrow button
Then Total borrow amount should calculate as borrowResultTextAmount "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500."

