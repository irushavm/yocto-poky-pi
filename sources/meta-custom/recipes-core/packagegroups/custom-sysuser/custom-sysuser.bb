
DESCRIPTION = "Custom sysuser packagegroup"
SUMMARY = "Custom sysuser"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit extrausers
PASSWORD = "syspass"
USER = "sysuser"

EXTRA_USERS_PARAMS = "\
    useradd -p `openssl passwd ${PASSWORD}` ${USER}; \
    usermod -a -G sudo ${USER}; \
"