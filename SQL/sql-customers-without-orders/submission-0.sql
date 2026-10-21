Select name
FROM customers 
left Join orders 
on customers.id=orders.customer_id
where customer_id is Null

