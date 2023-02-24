select t2.ingredient_type, sum(t1.total_order)
from first_half as t1, icecream_info as t2
where t1.flavor = t2.flavor
group by t2.ingredient_type;