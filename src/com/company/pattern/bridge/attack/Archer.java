package com.company.pattern.bridge.attack;

import com.company.pattern.bridge.ERangeType;
import com.company.pattern.bridge.EWeaponType;
import com.company.pattern.bridge.IUnitType;

public class Archer implements IUnitType {
    @Override
    public ERangeType getRangeType() {
        return ERangeType.RANGE;
    }

    @Override
    public EWeaponType getWeaponType() {
        return EWeaponType.PIERCING;
    }
}
