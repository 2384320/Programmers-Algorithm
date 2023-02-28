select warehouse_id, warehouse_name, address, (
    case when freezer_yn is null then 'N'
        when freezer_yn is not null then freezer_yn
    end
)
from food_warehouse
where address like "%경기%"
order by warehouse_id;