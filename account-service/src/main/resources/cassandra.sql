CREATE KEYSPACE springcloud
    WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 3};

use springCloud;

CREATE TABLE emp(
                    emp_id int PRIMARY KEY,
                    emp_name text,
                    emp_city text,
                    emp_sal varint,
                    emp_phone varint
);

select * from emp

