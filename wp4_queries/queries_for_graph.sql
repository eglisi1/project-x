use project_x;

-- query 1: node list
SELECT 
    event_id, name
FROM
    event
ORDER BY event_id;

-- query 2: edge list
SELECT 
    s1.event_id AS lhs, s2.event_id AS rhs
FROM
    shows s1,
    shows s2
WHERE
    s1.performance_id = s2.performance_id
        AND s1.shows_id < s2.shows_id
;

-- query 2: edge list
SELECT 
    p1.warehouse_id AS lhs, d2.warehouse_id AS rhs
FROM
    performance p1,
    performance p2
WHERE
    d1.flight_plan_id = d2.flight_plan_id
        AND d1.warehouse_id < d2.warehouse_id
;