DESCRIPTION = "Custom dev apps packagegroup"
SUMMARY = "Custom packagegroup - tools/testapps"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    ethtool \
    evtest \
    fbset \
    i2c-tools \
    memtester \
    util-linux-fdisk \
    util-linux-lsblk \
    util-linux-lscpu \
    apt \
    kernel-modules \
"
