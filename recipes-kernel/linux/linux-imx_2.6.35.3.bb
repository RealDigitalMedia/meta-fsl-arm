# Copyright (C) 2011-2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Freescale"
DESCRIPTION = "Linux Kernel provided and supported by Freescale with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

PR = "r45"

include linux-imx.inc

COMPATIBLE_MACHINE = "(mx28|mx5)"

# Revision of imx_2.6.35_maintain branch
SRCREV = "903363ed80a113f2d1e3e96e508ecf128d9af323"
LOCALVERSION = "-maintain+yocto"
SRCBRANCH = "imx_2.6.35_maintain"

SRC_URI += "file://NFS-Fix-nfsroot-support.patch \
            file://NFS-allow-nfs-root-mount-to-use-alternate-rpc-ports.patch \
            file://perf-avoid-use-sysroot-headers.patch \
"

SRC_URI_append_mx28 = " \
           file://mxs-duart-use-ttyAMA-for-device-name.patch \
"
