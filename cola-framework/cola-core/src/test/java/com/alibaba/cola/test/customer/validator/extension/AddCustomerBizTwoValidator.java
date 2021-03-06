package com.alibaba.cola.test.customer.validator.extension;

import com.alibaba.cola.exception.Assert;
import com.alibaba.cola.exception.BizException;
import com.alibaba.cola.extension.Extension;
import com.alibaba.cola.test.customer.AddCustomerCmd;
import com.alibaba.cola.test.customer.Constants;
import com.alibaba.cola.test.customer.validator.extensionpoint.AddCustomerValidatorExtPt;

/**
 * AddCustomerBizTwoValidator
 *
 * @author Frank Zhang
 * @date 2018-01-07 1:31 AM
 */
@Extension(bizCode = Constants.BIZ_TWO)
public class AddCustomerBizTwoValidator implements AddCustomerValidatorExtPt{

    @Override
    public void validate(Object candidate) {
        AddCustomerCmd addCustomerCmd = (AddCustomerCmd) candidate;
        //For BIZ TWO CustomerTYpe could not be null
        Assert.notNull(addCustomerCmd.getCustomerCO());
        Assert.notNull(addCustomerCmd.getCustomerCO().getCustomerType());
    }
}
