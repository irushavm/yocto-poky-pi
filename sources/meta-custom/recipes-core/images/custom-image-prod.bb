SUMMARY = "Custom production image"
LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL = "inotify-tools"

IMAGE_INSTALL_append = "sysuser"
