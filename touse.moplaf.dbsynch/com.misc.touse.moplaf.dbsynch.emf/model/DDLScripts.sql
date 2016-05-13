create schema fpd_t;

set schema fpd_t;

drop table SortingPlan;

create table SortingPlan 
( id char(32)
, name char(128)
);

-- for sqlserver, to have non fixed length strings
create table SortingPlan 
( id varchar(32)
, name varchar(128)
);

alter table SortingPlan
add  validfrom date;

alter table SortingPlan
add validto date;

create table SortingPlanInput
( sortingplanid char(32)
, productid  char(32) 
);

insert into SortingPlan ( id, name, validfrom, validto) 
values ( 'id1', 'premier', '2016-01-01', '2016-12-31')
;

delete from SortingPlan;

insert into SortingPlan  
values ( 'id2', 'second', '2016-02-02', '2016-11-30')
;


commit;

insert into SortingPlan ( id ) values ( 'jj');

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