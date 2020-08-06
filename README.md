# Code-For-Cause

<img alt="insecure" src="https://github.com/aelinadas/code-for-cause/blob/master/images/insecure.png" />

#### A swing application to develop a system that allows different organizations that will come together and serve a large underprivileged populace in most effective way. We have designed a system that allows Food Banks, Hospitals, and Food Pantries to communicate effectively to monitor food insecurity and health issues in an unpriviledged community. In this system, we have brought three different entities into the ecosystem model to establish hierarchy and leveraged workflows as a means for effective communication.

## Team Info

NAME | GIT ID
------------ | -------------
AELINA DAS | [aelinadas](https://github.com/aelinadas)
ABHISHEK VISHWANATH | [v-abhishek](https://github.com/v-abhishek)

## Languages and Tools used

<img align="left" alt="java" width="50px" height="60px" src="https://github.com/aelinadas/aelinadas/blob/master/images/java.png" />
<img align="left" alt="swing" width="50px" height="40px" src="https://github.com/aelinadas/code-for-cause/blob/master/images/swing.png" />
<img align="left" alt="db4o" width="60px" height="60px" src="https://github.com/aelinadas/code-for-cause/blob/master/images/db4o.jpg" />
<img align="left" alt="netbeans" width="50px" height="50px" src="https://github.com/aelinadas/aelinadas/blob/master/images/netbeans.png" />
<br />
<br />


## Architecture
<img alt="architecture" src="https://github.com/aelinadas/code-for-cause/blob/master/images/architecture.png" />

---

## Workflow
<img alt="architecture" src="https://github.com/aelinadas/code-for-cause/blob/master/images/workflow.png" />

---

## Application features and Use Cases

1. A common login screen for all users
2. A Network admin can add Food Banks and Hospitals under them
3. Food Bank can add multiple soup kitchens under them
4. A Food Bank Admin can manage their inventory
5. The inventory that contains the list of food items is visible to all the soup kitchens tied with them
    <img alt="inventory" src="https://github.com/aelinadas/code-for-cause/blob/master/images/inventory.png" />
6. A Food Pantry Admin can place an order of food items with their respective Food Banks
    <img alt="cart" src="https://github.com/aelinadas/code-for-cause/blob/master/images/cart.png" />
7. Also a Food Pantry Admin can raise a health screening request for their community members with the hospitals that are in the same network
    <img alt="health" src="https://github.com/aelinadas/code-for-cause/blob/master/images/health.png" />
8. A Food Pantry Admin can keep track of requests using the dashboard
    <img alt="track" src="https://github.com/aelinadas/code-for-cause/blob/master/images/track.png" />
9. A Food packing department can view the pending order requests and once packed they can inform the logistics team to deliver the same
    <img alt="orderRequest" src="https://github.com/aelinadas/code-for-cause/blob/master/images/packer1.png" />
    <img alt="forward" src="https://github.com/aelinadas/code-for-cause/blob/master/images/packer2.png" />
    <br />
10. Logistics Team can confirm the estimated date and time of order delivery, that triggers an email to the Food Pantry Admin informing the date and time of delivery <br />
    <img alt="logistic" src="https://github.com/aelinadas/code-for-cause/blob/master/images/logistic.png" />
11. Email received by a Food Pantry Admin on food delivery
    <img alt="emailOrder" src="https://github.com/aelinadas/code-for-cause/blob/master/images/emailOrder.png" />
12. Email received by Food Pantry Admin on Nutritionist appointment approval
    <img alt="nutrition" src="https://github.com/aelinadas/code-for-cause/blob/master/images/nutritionist.png" />
13. A doctor can raise laboratory test request for patients and track the lab tests using the dashboard
    <img alt="doctor" src="https://github.com/aelinadas/code-for-cause/blob/master/images/doctor.png" />
14. A doctor can accept as well as set appointments for health screening that triggers an email to the Food Pantry Admin informing the date and time of health screening
    <img alt="docApt" src="https://github.com/aelinadas/code-for-cause/blob/master/images/docApt.png" />
15.  Email received by a Food Pantry Admin on health screening appointment approval
    <img alt="health" src="https://github.com/aelinadas/code-for-cause/blob/master/images/healthScreening.png" />    
16. Lab Assistant team can view and work on pending lab tests and can later update the results
    <img alt="lab" src="https://github.com/aelinadas/code-for-cause/blob/master/images/lab.png" /> 
17. A Food Pantry Admin can keep track of number of meals served each day and later draw insights on economic condition of the community
    <img alt="graph" src="https://github.com/aelinadas/code-for-cause/blob/master/images/graph.png" /> 

## Conclusion

- We believe that adopting a well connected organization serves the poor community well
- Keeping track of meals served per day can draw insights on econimic condition of the community

## Install and Run

- Install Java (Java 8 or above) on your machine
- Clone or download this repository on to your machine
- Install NetBeans IDE (SE Version), if not present
- Import the cloned or downloaded project
- Click on run and the application is ready for use 
- Enter Username and Password as admin to add new enterprises and user accounts