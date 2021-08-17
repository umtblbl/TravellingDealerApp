# TravellingDealerApp

# Problem

In this example we’re going to help a dealer in order to reduce the cost of his/her sale operaon.
As you may noice, Image‐1 represents the customers (8 units) and a factory. Dealer should travel to his/her customers by using the shortest path. The dealer must visit the factory after every customer visitation.
We need to calculate the total distance that dealer need to travel in order to visit each customer.

# Solution
We can solve this problem with the help of a node structure and a LinkedList that holds them. The top node of the list will be the factory. Child nodes will be customers.

If the hypotenuse distances from the head node to all the other nodes are added together, the required path distance for a single trip is obtained.

Since the seller will go back to the factory on each delivery, multiplying this distance by 2 gives the total distance that the seller has to travel.

# Screenshots

<img width="30%" align="left" src="https://imgur.com/YFpOkmb.png" />
<img width="30%" align="end" src="https://imgur.com/RCg6YSN.png" />
