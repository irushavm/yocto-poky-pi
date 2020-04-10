SUMMARY = "Custom production image"
LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += "inotify-tools net-tools"

DISTRO_FEATURES_append = " bluez5 bluetooth wifi "
IMAGE_INSTALL_append = " linux-firmware-rpidistro-bcm43430 "

RDEPENDS_${PN}_append = " wpa-supplicant "

inherit extrausers
PASSWORD = "syspass"
USER = "sysuser"

EXTRA_USERS_PARAMS = "\
    useradd -p `openssl passwd ${PASSWORD}` ${USER}; \
    usermod -a -G sudo ${USER}; \
"