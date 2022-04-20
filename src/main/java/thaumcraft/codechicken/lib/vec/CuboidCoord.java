// 
// Decompiled by Procyon v0.6.0
// 

package thaumcraft.codechicken.lib.vec;

import java.util.Iterator;
import net.minecraft.util.math.AxisAlignedBB;
import thaumcraft.codechicken.lib.util.Copyable;

public class CuboidCoord implements Iterable<BlockCoord>, Copyable<CuboidCoord>
{
    public BlockCoord min;
    public BlockCoord max;
    
    public CuboidCoord() {
        this.min = new BlockCoord();
        this.max = new BlockCoord();
    }
    
    public CuboidCoord(final BlockCoord min, final BlockCoord max) {
        this.min = min;
        this.max = max;
    }
    
    public CuboidCoord(final BlockCoord coord) {
        this(coord, coord.copy());
    }
    
    public CuboidCoord(final int[] ia) {
        this(ia[0], ia[1], ia[2], ia[3], ia[4], ia[5]);
    }
    
    public CuboidCoord(final int x1, final int y1, final int z1, final int x2, final int y2, final int z2) {
        this(new BlockCoord(x1, y1, z1), new BlockCoord(x2, y2, z2));
    }
    
    public CuboidCoord expand(final int amount) {
        return this.expand(amount, amount, amount);
    }
    
    public CuboidCoord expand(final int x, final int y, final int z) {
        this.max.add(x, y, z);
        this.min.sub(x, y, z);
        return this;
    }
    
    public CuboidCoord expand(final int side, final int amount) {
        if (side % 2 == 0) {
            this.min = this.min.offset(side, amount);
        }
        else {
            this.max = this.max.offset(side, amount);
        }
        return this;
    }
    
    public int size(final int s) {
        switch (s) {
            case 0:
            case 1: {
                return this.max.y - this.min.y + 1;
            }
            case 2:
            case 3: {
                return this.max.z - this.min.z + 1;
            }
            case 4:
            case 5: {
                return this.max.x - this.min.x + 1;
            }
            default: {
                return 0;
            }
        }
    }
    
    public int getSide(final int s) {
        switch (s) {
            case 0: {
                return this.min.y;
            }
            case 1: {
                return this.max.y;
            }
            case 2: {
                return this.min.z;
            }
            case 3: {
                return this.max.z;
            }
            case 4: {
                return this.min.x;
            }
            case 5: {
                return this.max.x;
            }
            default: {
                throw new IndexOutOfBoundsException("Switch Falloff");
            }
        }
    }
    
    public CuboidCoord setSide(final int s, final int v) {
        switch (s) {
            case 0: {
                this.min.y = v;
                break;
            }
            case 1: {
                this.max.y = v;
                break;
            }
            case 2: {
                this.min.z = v;
                break;
            }
            case 3: {
                this.max.z = v;
                break;
            }
            case 4: {
                this.min.x = v;
                break;
            }
            case 5: {
                this.max.x = v;
                break;
            }
            default: {
                throw new IndexOutOfBoundsException("Switch Falloff");
            }
        }
        return this;
    }
    
    public int getVolume() {
        return (this.max.x - this.min.x + 1) * (this.max.y - this.min.y + 1) * (this.max.z - this.min.z + 1);
    }
    
    public Vector3 getCenterVec() {
        return new Vector3(this.min.x + (this.max.x - this.min.x + 1) / 2.0, this.min.y + (this.max.y - this.min.y + 1) / 2.0, this.min.z + (this.max.z - this.min.z + 1) / 2.0);
    }
    
    public BlockCoord getCenter(final BlockCoord store) {
        store.set(this.min.x + (this.max.x - this.min.x) / 2, this.min.y + (this.max.y - this.min.y) / 2, this.min.z + (this.max.z - this.min.z) / 2);
        return store;
    }
    
    public boolean contains(final BlockCoord coord) {
        return this.contains(coord.x, coord.y, coord.z);
    }
    
    public boolean contains(final int x, final int y, final int z) {
        return x >= this.min.x && x <= this.max.x && y >= this.min.y && y <= this.max.y && z >= this.min.z && z <= this.max.z;
    }
    
    public int[] intArray() {
        return new int[] { this.min.x, this.min.y, this.min.z, this.max.x, this.max.y, this.max.z };
    }
    
    @Override
    public CuboidCoord copy() {
        return new CuboidCoord(this.min.copy(), this.max.copy());
    }
    
    public Cuboid6 bounds() {
        return new Cuboid6(this.min.x, this.min.y, this.min.z, this.max.x + 1, this.max.y + 1, this.max.z + 1);
    }
    
    public AxisAlignedBB toAABB() {
        return this.bounds().aabb();
    }
    
    public void set(final BlockCoord min, final BlockCoord max) {
        this.min.set(min);
        this.max.set(max);
    }
    
    public CuboidCoord set(final int x1, final int y1, final int z1, final int x2, final int y2, final int z2) {
        this.min.set(x1, y1, z1);
        this.max.set(x2, y2, z2);
        return this;
    }
    
    public CuboidCoord set(final BlockCoord coord) {
        this.min.set(coord);
        this.max.set(coord);
        return this;
    }
    
    public CuboidCoord set(final int[] ia) {
        return this.set(ia[0], ia[1], ia[2], ia[3], ia[4], ia[5]);
    }
    
    public CuboidCoord include(final BlockCoord coord) {
        return this.include(coord.x, coord.y, coord.z);
    }
    
    public CuboidCoord include(final int x, final int y, final int z) {
        if (x < this.min.x) {
            this.min.x = x;
        }
        else if (x > this.max.x) {
            this.max.x = x;
        }
        if (y < this.min.y) {
            this.min.y = y;
        }
        else if (y > this.max.y) {
            this.max.y = y;
        }
        if (z < this.min.z) {
            this.min.z = z;
        }
        else if (z > this.max.z) {
            this.max.z = z;
        }
        return this;
    }
    
    @Override
    public Iterator<BlockCoord> iterator() {
        return new Iterator<BlockCoord>() {
            BlockCoord b = null;
            
            @Override
            public boolean hasNext() {
                return this.b == null || !this.b.equals(CuboidCoord.this.max);
            }
            
            @Override
            public BlockCoord next() {
                if (this.b == null) {
                    this.b = CuboidCoord.this.min.copy();
                }
                else if (this.b.z != CuboidCoord.this.max.z) {
                    final BlockCoord b = this.b;
                    ++b.z;
                }
                else {
                    this.b.z = CuboidCoord.this.min.z;
                    if (this.b.y != CuboidCoord.this.max.y) {
                        final BlockCoord b2 = this.b;
                        ++b2.y;
                    }
                    else {
                        this.b.y = CuboidCoord.this.min.y;
                        final BlockCoord b3 = this.b;
                        ++b3.x;
                    }
                }
                return this.b.copy();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
