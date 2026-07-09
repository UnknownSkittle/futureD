/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.impact;

import a.a.a.b;
import a.a.a.d;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.k;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonLibrary;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonVersiontweakersTypeToken;
import io.github.ImpactDevelopment.installer.libraries.ILibrary;
import io.github.ImpactDevelopment.installer.libraries.LibraryBaritoneSpecific;
import io.github.ImpactDevelopment.installer.libraries.LibraryMaven;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.settings.ImpactVersionSetting;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImpactJsonVersion {
    public String name;
    public String version;
    public String mcVersion;
    public String mainClass = "net.minecraft.launchwrapper.Launch";
    public String date;
    public List<String> tweakers;
    public ImpactJsonLibrary[] libraries;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.version);
        System.out.println(this.mcVersion);
        System.out.println(this.mainClass);
        System.out.println(this.date);
        System.out.println(this.tweakers);
        ImpactJsonLibrary[] impactJsonLibraryArray = this.libraries;
        int n2 = this.libraries.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ImpactJsonLibrary impactJsonLibrary = impactJsonLibraryArray[i2];
            System.out.println(impactJsonLibrary.name + " " + impactJsonLibrary.sha1 + " " + impactJsonLibrary.size);
        }
    }

    public List<ILibrary> resolveLibraries(InstallationConfig installationConfig) {
        return Stream.of(this.libraries).map(impactJsonLibrary -> {
            String[] stringArray = impactJsonLibrary.name.split(":");
            if (stringArray.length != 3) {
                throw new IllegalStateException("malformed " + impactJsonLibrary.name);
            }
            String string = stringArray[1];
            if (string.equals("baritone-api")) {
                if (stringArray[2].contains("*")) {
                    throw new IllegalStateException(stringArray[2]);
                }
                return new LibraryBaritoneSpecific((ImpactJsonLibrary)impactJsonLibrary);
            }
            if (string.equals(this.name)) {
                return installationConfig.getSettingValue(ImpactVersionSetting.INSTANCE).resolveSelf((ImpactJsonLibrary)impactJsonLibrary);
            }
            return new LibraryMaven((ImpactJsonLibrary)impactJsonLibrary);
        }).collect(Collectors.toList());
    }

    public /* synthetic */ void toJson$1(k k2, com.a.a.d.d d2, d d3) {
        d2.d();
        this.toJsonBody$1(k2, d2, d3);
        d2.e();
    }

    protected /* synthetic */ void toJsonBody$1(k k2, com.a.a.d.d d2, d d3) {
        ImpactJsonLibrary[] impactJsonLibraryArray;
        ImpactJsonVersion impactJsonVersion = this;
        if (impactJsonVersion != impactJsonVersion.name) {
            d3.a(d2, 5);
            d2.b(this.name);
        }
        ImpactJsonVersion impactJsonVersion2 = this;
        if (impactJsonVersion2 != impactJsonVersion2.version) {
            d3.a(d2, 8);
            d2.b(this.version);
        }
        ImpactJsonVersion impactJsonVersion3 = this;
        if (impactJsonVersion3 != impactJsonVersion3.mcVersion) {
            d3.a(d2, 4);
            d2.b(this.mcVersion);
        }
        ImpactJsonVersion impactJsonVersion4 = this;
        if (impactJsonVersion4 != impactJsonVersion4.mainClass) {
            d3.a(d2, 3);
            d2.b(this.mainClass);
        }
        ImpactJsonVersion impactJsonVersion5 = this;
        if (impactJsonVersion5 != impactJsonVersion5.date) {
            d3.a(d2, 1);
            d2.b(this.date);
        }
        ImpactJsonVersion impactJsonVersion6 = this;
        if (impactJsonVersion6 != impactJsonVersion6.tweakers) {
            d3.a(d2, 7);
            impactJsonLibraryArray = this.tweakers;
            a.a.a.a.a(k2, new ImpactJsonVersiontweakersTypeToken(), this.tweakers).write(d2, impactJsonLibraryArray);
        }
        ImpactJsonVersion impactJsonVersion7 = this;
        if (impactJsonVersion7 != impactJsonVersion7.libraries) {
            d3.a(d2, 6);
            impactJsonLibraryArray = this.libraries;
            a.a.a.a.a(k2, ImpactJsonLibrary[].class, (Object)this.libraries).write(d2, impactJsonLibraryArray);
        }
    }

    public /* synthetic */ void fromJson$1(k k2, a a2, b b2) {
        a2.c();
        while (a2.e()) {
            int n2 = b2.a(a2);
            this.fromJsonField$1(k2, a2, n2);
        }
        a2.d();
    }

    protected /* synthetic */ void fromJsonField$1(k k2, a a2, int n2) {
        boolean bl2 = a2.f() != c.i;
        switch (n2) {
            case 5: {
                if (bl2) {
                    if (a2.f() != c.h) {
                        this.name = a2.h();
                        return;
                    }
                    this.name = Boolean.toString(a2.i());
                    return;
                }
                this.name = null;
                a2.j();
                return;
            }
            case 8: {
                if (bl2) {
                    if (a2.f() != c.h) {
                        this.version = a2.h();
                        return;
                    }
                    this.version = Boolean.toString(a2.i());
                    return;
                }
                this.version = null;
                a2.j();
                return;
            }
            case 4: {
                if (bl2) {
                    if (a2.f() != c.h) {
                        this.mcVersion = a2.h();
                        return;
                    }
                    this.mcVersion = Boolean.toString(a2.i());
                    return;
                }
                this.mcVersion = null;
                a2.j();
                return;
            }
            case 3: {
                if (bl2) {
                    if (a2.f() != c.h) {
                        this.mainClass = a2.h();
                        return;
                    }
                    this.mainClass = Boolean.toString(a2.i());
                    return;
                }
                this.mainClass = null;
                a2.j();
                return;
            }
            case 1: {
                if (bl2) {
                    if (a2.f() != c.h) {
                        this.date = a2.h();
                        return;
                    }
                    this.date = Boolean.toString(a2.i());
                    return;
                }
                this.date = null;
                a2.j();
                return;
            }
            case 7: {
                if (bl2) {
                    this.tweakers = k2.a(new ImpactJsonVersiontweakersTypeToken()).read(a2);
                    return;
                }
                this.tweakers = null;
                a2.j();
                return;
            }
            case 6: {
                if (bl2) {
                    this.libraries = k2.a(ImpactJsonLibrary[].class).read(a2);
                    return;
                }
                this.libraries = null;
                a2.j();
                return;
            }
        }
        a2.n();
    }
}

