# cassandra-demo

```sql
CREATE TABLE sampleks.users (
    id int PRIMARY KEY,
    favorites map<text, text>,
    name text
)
```