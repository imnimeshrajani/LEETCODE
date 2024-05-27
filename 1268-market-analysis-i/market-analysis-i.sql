# Write your MySQL query statement below
SELECT user_id AS buyer_id, join_date, COUNT(order_id) AS orders_in_2019 FROM Users AS u
LEFT JOIN Orders AS o ON buyer_id = user_id AND YEAR(order_date)  = "2019"
Group BY user_id;