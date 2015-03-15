create schema fpd_t;

set schema fpd_t;

create table SortingPlan 
( id char(32)
, name char(128)
);

alter table SortingPlan
add column validfrom date;

alter table SortingPlan
add column validto date;

create table SortingPlanInput
( sortingplanid char(32)
, productid  char(32) 
);

select sp.id
     , sp.name
     , sp.validfrom
     , sp.validto
from SortingPlan as sp;

select si.sortingplanid
     , si.productid
     , sp.validfrom
     , sp.validto
from SortingPlan      as sp
   , SortingPlanInput as si
where sp.id= si.sortingplanid;