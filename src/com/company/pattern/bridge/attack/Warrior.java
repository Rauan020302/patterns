package com.company.pattern.bridge.attack;

import com.company.pattern.bridge.ERangeType;
import com.company.pattern.bridge.EWeaponType;
import com.company.pattern.bridge.IUnitType;

public class Warrior implements IUnitType {
    @Override
    public ERangeType getRangeType() {
        return ERangeType.CLOSE;
    }

    @Override
    public EWeaponType getWeaponType() {
        return EWeaponType.CUTTING;
    }

}
