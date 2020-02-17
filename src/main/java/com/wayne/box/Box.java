package com.wayne.box;

import java.util.Arrays;

public class Box {

    float length;
    float width;
    int height;

    public Box(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, int height) {

        float[] nums = { length, width, (float) height};

        sequence(nums);

        length = nums[2];
        width = nums[1];
        height = (int) nums[0];

        if ( height > this.height )
            return false;

        else if ( width > this.width )
            return false;

        else if ( length > this.length )
            return false;

        else
            return true;
    }

    // Sequence input number
    private void sequence (float[] nums ) {
        Arrays.sort(nums);


    }

}
