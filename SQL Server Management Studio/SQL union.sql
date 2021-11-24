select e.empno,e.ename,j.startdate,j.enddate
from emp e
full outer join
jobhist j
on(e.empno=j.empno)
where j.enddate is not null and e.empno in(select empno
                                     from emp
									 union
									 select empno
									 from jobhist)
									 order by j.startdate