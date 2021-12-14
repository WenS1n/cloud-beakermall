package cn.vesns.beakermall.product.controller;

import cn.vesns.beakermall.product.entity.BrandEntity;
import cn.vesns.beakermall.product.service.BrandService;
import cn.vesns.common.utils.PageUtils;
import cn.vesns.common.utils.R;
import cn.vesns.common.valid.AddGroup;
import cn.vesns.common.valid.UpdateGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;


/**
 * 品牌
 *
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-09 17:29:03
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params) {

        params.forEach((k,v)-> {
            System.out.println("key:value = " + k+":" + v);
        });
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId) {
        BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:brand:save")
    public R save(@Validated({AddGroup.class}) @RequestBody BrandEntity brand /*,BindingResult result*/) {
//        if (result.hasErrors()) {
//            Map<String, String> map = new HashMap<>();
//            result.getFieldErrors().forEach((item) -> {
//                String defaultMessage = item.getDefaultMessage();
//                String field = item.getField();
//                map.put(field, defaultMessage);
//            });
//            return R.error(400, "提交的数据不合法").put("data", map);
//        } else {
//
//        }

        brandService.save(brand);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:brand:update")
    public R update(@Validated({UpdateGroup.class})@RequestBody BrandEntity brand) {
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds) {
        brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
